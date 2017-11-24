package com.hasanac.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by christopherhasanali on 11/24/17.
 */
public class SlayDragonOnQuest implements Quest {
    private PrintStream stream;

    public SlayDragonOnQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon :)");
    }
}
