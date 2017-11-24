package com.hasanac.springinaction.knights;

/**
 * Created by christopherhasanali on 11/24/17.
 */
public class BraveKnight implements Knight {
    private Quest quest;
    private Minstrel minstrel;
    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public void embarkOnQuest() {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
