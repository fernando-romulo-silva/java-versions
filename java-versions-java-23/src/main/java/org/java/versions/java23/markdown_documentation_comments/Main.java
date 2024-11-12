package org.java.versions.java23.markdown_documentation_comments;

public class Main {

    /**
     * Returns the ceiling modulus of the {@code long} and {@code int} arguments.
     * <p>
     * The ceiling modulus is {@code r = x – (ceilDiv(x, y) * y)},
     * has the opposite sign as the divisor {@code y} or is zero, and
     * is in the range of {@code -abs(y) < r < +abs(y)}.
     *
     * <p>
     * The relationship between {@code ceilDiv} and {@code ceilMod} is such that:
     * <ul>
     * <li>{@code ceilDiv(x, y) * y + ceilMod(x, y) == x}</li>
     * </ul>
     * <p>
     * For examples, see {@link #ceilMod(int, int)}.
     *
     * @param x the dividend
     * @param y the divisor
     * 
     * @return the ceiling modulus {@code x – (ceilDiv(x, y) * y)}
     * 
     * @throws ArithmeticException if the divisor {@code y} is zero
     * 
     * @see #ceilDiv(long, int)
     * @since 18
     */
    public int test01(final int x, final int y) {

        return 0;
    }

    /// Returns the ceiling modulus of the `long` and `int` arguments.
    ///
    /// The ceiling modulus is `r = x – (ceilDiv(x, y) * y)`,
    /// has the opposite sign as the divisor `y` or is zero, and
    /// is in the range of `-abs(y) < r < +abs(y)`.
    ///
    /// The relationship between `ceilDiv` and `ceilMod` is such that:
    ///
    /// – `ceilDiv(x, y) * y + ceilMod(x, y) == x`
    ///
    /// For examples, see [#ceilMod(int, int)].
    /// 
    ///
    /// @param x the dividend
    /// @param y the divisor
    /// 
    /// @return the ceiling modulus `x – (ceilDiv(x, y) * y)`
    /// 
    /// @throws ArithmeticException if the divisor `y` is zero
    /// 
    /// @see #ceilDiv(long, int)
    /// @since 18
    public int test02(final int x, final int y) {

        return 0;
    }

    ///
    /// ```
    /// This is a block of source codex.
    /// ```
    ///
    ///     Indented text
    ///     is also rendered as a code block.
    ///
    /// ~~~
    /// This is also a block of source code
    /// ~~~
    /// This is a bulleted list:
    /// – One
    /// – Two
    /// – Three
    ///
    /// This is a numbered list:
    /// 1. One
    /// 1. Two
    /// 1. Three
    /// 
    /// **This text is bold.**
    /// *This text is italic.*
    /// _This is also italic._
    /// `This is source code.`
    /// 
    /// | Binary | Decimal |
    /// |--------|---------|
    /// |     00 |       0 |
    /// |     01 |       1 |
    /// |     10 |       2 |
    /// |     11 |       3 |
    /// 
    /// Links:
    /// – ein Modul: [java.base/]
    /// – ein Paket: [java.lang]
    /// – eine Klasse: [Integer]
    /// – ein Feld: [Integer#MAX_VALUE]
    /// – eine Methode: [Integer#parseInt(String, int)]
    public void test03() {

    }
}
