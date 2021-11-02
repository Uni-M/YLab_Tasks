package level3.display_tasks.task3;

//  StarCraft
//  Создать 10 зергов, 5 протосов и 12 терран.
//  Дать им всем уникальные имена.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Zerg> zergs = new ArrayList<>();
        ArrayList<Protos> protos = new ArrayList<>();
        ArrayList<Terran> terrans = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            Zerg z = new Zerg();
            z.setName("Zerg #" + i);
            zergs.add(z);
        }

        for (int i = 1; i <= 5; i++){
            Protos p = new Protos();
            p.setName("Protos #" + i);
            protos.add(p);
        }

        for (int i = 1; i <= 12; i++){
            Terran t = new Terran();
            t.setName("Terran #" + i);
            terrans.add(t);
        }
    }
}
