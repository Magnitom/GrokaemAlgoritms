package lenghtListrecurs;

import java.util.List;

public class LenghtList {

    public int lenghtList(List<String> list){

        if (list.isEmpty()){
            return 0;
        }else {
            list.remove(0);
            return 1 + lenghtList(list);
        }

    }
}
