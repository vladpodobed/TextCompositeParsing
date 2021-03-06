package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.entity.TextObject;
import by.epam.training.task02.logic.LogicException;

/**
 * Created by Higgs on 08.04.2015.
 */
public abstract class Parser {

    public void setTextObject(TextObject textObject) {
        throw new UnsupportedOperationException();
    }

    public TextObject getTextObject() {
        throw new UnsupportedOperationException();
    }

    public void setNextParser(Parser nextParser) {
        throw new UnsupportedOperationException();
    }

    public Parser getNextParser() {
        throw new UnsupportedOperationException();
    }

    public void setCodeParser(Parser codeParser) {
        throw new UnsupportedOperationException();
    }

    public Parser getCodeParser() {
        throw new UnsupportedOperationException();
    }

    public void parse(String text) throws LogicException {
        throw new LogicException("Unsupported operation for this object");
    }

    public void parse(String text, TextComponent parentComponent) throws LogicException {
        throw new LogicException("Unsupported operation for this object");
    }

}
