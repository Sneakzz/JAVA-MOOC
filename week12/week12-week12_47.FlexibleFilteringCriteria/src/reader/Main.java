package reader;

import reader.criteria.*;

public class Main {

    public static void main(String[] args) {
        // testing ContainsWord class
//        String address = "http://www.gutenberg.myebook.bg/2/5/5/2554/2554-8.txt";
//        GutenbergReader book = new GutenbergReader(address);
//
//        Criterion criterion = new ContainsWord("beer");
//
//        for (String line : book.linesWhichComplyWith(criterion)) {
//            System.out.println(line);
//        }

        // testing AllLines class
//        String address = "http://www.gutenberg.myebook.bg/2/5/5/2554/2554-8.txt";
//        GutenbergReader book = new GutenbergReader(address);
//
//        Criterion criterion = new AllLines();
//
//        for (String line : book.linesWhichComplyWith(criterion)) {
//            System.out.println(line);
//        }
        // testing EndsWithQuestionMarkOrExclamationMark class
//        String address = "http://www.gutenberg.myebook.bg/2/5/5/2554/2554-8.txt";
//        GutenbergReader book = new GutenbergReader(address);
//
//        Criterion criterion = new EndsWithQuestionOrExclamationMark();
//
//        for (String line : book.linesWhichComplyWith(criterion)) {
//            System.out.println(line);
//        }
        // testing LengthAtLeast class
//        String address = "http://www.gutenberg.myebook.bg/2/5/5/2554/2554-8.txt";
//        GutenbergReader book = new GutenbergReader(address);
//
//        Criterion criterion = new LengthAtLeast(40);
//
//        for (String line : book.linesWhichComplyWith(criterion)) {
//            System.out.println(line);
//        }
        // testing Both class
//        String address = "http://www.gutenberg.myebook.bg/2/5/5/2554/2554-8.txt";
//        GutenbergReader book = new GutenbergReader(address);
//
//        Criterion criterion = new Both(
//                new EndsWithQuestionOrExclamationMark(),
//                new ContainsWord("beer")
//        );
//
//        for (String line : book.linesWhichComplyWith(criterion)) {
//            System.out.println(line);
//        }
        // testing Not class
//        String address = "http://www.gutenberg.myebook.bg/2/5/5/2554/2554-8.txt";
//        GutenbergReader book = new GutenbergReader(address);
//
//        Criterion criterion = new Not(new LengthAtLeast(10));
//
//        for (String line : book.linesWhichComplyWith(criterion)) {
//            System.out.println(line);
//        }
        // testing AtLeastOne class
        String address = "http://www.gutenberg.myebook.bg/2/5/5/2554/2554-8.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion = new AtLeastOne(
                new ContainsWord("beer"),
                new ContainsWord("milk"),
                new ContainsWord("oil")
        );

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }

        Criterion words = new AtLeastOne(
                new ContainsWord("beer"),
                new ContainsWord("milk"),
                new ContainsWord("oil")
        );

        Criterion rightLength = new Both(
                new LengthAtLeast(20),
                new Not(new LengthAtLeast(31))
        );

        Criterion wanted = new Both(words, rightLength);
    }
}
