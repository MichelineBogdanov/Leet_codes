package ru.bogdanov.goal_parser_interpretation_1678;

public class GoalParserInterpretation {

    public static void main(String[] args) {

    }

    public String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }
}
