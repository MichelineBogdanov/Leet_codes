package ru.bogdanov.excel_sheet_column_title_168;

/**
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * <p>
 * Example 1:
 * <p>
 * Input: columnNumber = 1
 * Output: "A"
 * <p>
 * Example 2:
 * <p>
 * Input: columnNumber = 28
 * Output: "AB"
 * <p>
 * Example 3:
 * <p>
 * Input: columnNumber = 701
 * Output: "ZY"
 */
public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(52));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(702));
        System.out.println(convertToTitle(703));
        System.out.println(convertToTitle(704));
        System.out.println(convertToTitle(18253));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            int temp = columnNumber % 26 == 0 ? 25 : columnNumber % 26 - 1;
            res.append((char) ('A' + temp));
            columnNumber -= temp;
            columnNumber = columnNumber / 26 == 1 ? (columnNumber - 1) / 26 : columnNumber / 26;
        }
        return res.reverse().toString();
    }
}
