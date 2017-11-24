package com.hasanac.springinaction.knights;

/**
 * Created by christopherhasanali on 11/24/17.
 */
public class BraveKnight implements Knight {
    private Quest quest;
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
