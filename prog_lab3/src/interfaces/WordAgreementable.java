package interfaces;

import enums.Tense;
import objects.BaseObject;

public interface WordAgreementable {
    default String makeSentence(BaseObject object, String verb, Tense tense, String adding){
        return object.name + " " + tense.start + (tense != Tense.NOW ? verb.substring(0, verb.length() - 2) : verb) +
                tense.ending + (tense != Tense.NOW ? object.gender.ending : "") + " " + adding;
    }
}
