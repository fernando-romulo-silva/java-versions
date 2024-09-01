package org.java.versions.java09.reactive;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

class Main {

	static class EndSubscriber<T> implements Subscriber<T> {

		private Subscription subscription;

		public List<T> consumedElements = new LinkedList<>();

		@Override
		public void onSubscribe(Subscription subscription) {
			this.subscription = subscription;
			subscription.request(1);
		}

		@Override
		public void onError(Throwable t) {
			t.printStackTrace();
		}

		@Override
		public void onComplete() {
			System.out.println("Done");
		}

		@Override
		public void onNext(T item) {
			System.out.println("Got : " + item);
			consumedElements.add(item);
			subscription.request(1);
		}
	}

	public static void main(String[] args) {

		// given
		final SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

		final EndSubscriber<String> subscriber = new EndSubscriber<>();

		publisher.subscribe(subscriber);

		final List<String> items = List.of("1", "x", "2", "x", "3", "x");

		items.forEach(publisher::submit);

		publisher.close();

	}

}
