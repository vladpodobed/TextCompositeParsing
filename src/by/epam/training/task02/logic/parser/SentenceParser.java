package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.TextComponent;

/**
 * Created by Higgs on 08.04.2015.
 */
public class SentenceParser extends Parser {
    private static final SentenceParser instance = new SentenceParser();

    private SentenceParser() {
    }

    @Override
    public void parse(String text) {
    }

    @Override
    public void parse(String text, TextComponent parentComponent) {

    }

    public static SentenceParser getInstance() {
        return instance;
    }

}
