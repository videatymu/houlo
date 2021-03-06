package com.sin.lifesim.school.schools;

import com.sin.lifesim.MainActivity;
import com.sin.lifesim.Window;
import com.sin.lifesim.interfaces.method;
import com.sin.lifesim.school.School;

import org.jetbrains.annotations.NotNull;

public class PragueGymnasiumSchool extends School {


    public PragueGymnasiumSchool(@NotNull MainActivity m) {
        super(m.render);
        super.name = "prague";
        super.StudyTime = 150;
        maxStudents = 20;
        types.choose = types.mediumSchool;
        Window w = new Window(m);
        w.windowItems(new method.onmet() {
            @Override
            public void methoda(String[] string) {
                int i;
                if (string[0].equals("spanish")) {
                    i = School.subjects.languages.spanish;
                } else
                    i = School.subjects.languages.german;
                subjects = new int[]{School.subjects.nature, School.subjects.history, School.subjects.physics, School.subjects.math, School.subjects.languages.czech, School.subjects.languages.english, i};
            }
        }, new String[]{"spanish", "german"});

    }

    @Override
    public int study(MainActivity m) {
        super.study(m);
        return 0;
    }
}
