package by.epam.training.task02.logic.parser;

import by.epam.training.task02.entity.LeafTextElement;
import by.epam.training.task02.entity.TextComponent;
import by.epam.training.task02.logic.LogicException;
import by.epam.training.task02.util.regexutil.RegexConstants;
import by.epam.training.task02.util.regexutil.RegexTools;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Higgs on 08.04.2015.
 */
public class WordParser extends Parser {

    private static Logger log = Logger.getLogger(WordParser.class);


    public WordParser() {
    }

    @Override
    public void parse(String text, TextComponent parentComponent) throws LogicException {
        TextComponent component;
        List<String> matches;

        if (RegexTools.matches(RegexConstants.SENTENCE_SYMBOL_REGEX, text)) {
            matches = RegexTools.findByRegex(RegexConstants.SENTENCE_SYMBOL_REGEX, text);
            for (String match : matches) {
                component = new LeafTextElement(match);
                parentComponent.addTextComponent(component);
            }
        } else {
            log.info("NO WORDS TO PARSE");
        }
    }

}
