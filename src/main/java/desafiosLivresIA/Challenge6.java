package desafiosLivresIA;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Challenge6 {
        public static List<String> possibilities(String signals) {
            Map<String, String> mapMorse = new HashMap<String, String>();
            mapMorse.put(".-","A");
            mapMorse.put("-..","D");
            mapMorse.put(".","E");
            mapMorse.put("--.","G");
            mapMorse.put("..","I");
            mapMorse.put("-.-","K");
            mapMorse.put("--","M");
            mapMorse.put("-.","N");
            mapMorse.put("---","O");
            mapMorse.put(".-.","R");
            mapMorse.put("...","S");
            mapMorse.put("-","T");
            mapMorse.put("..-","U");
            mapMorse.put(".--","W");

            ArrayList<String> codMorse = new ArrayList<>();

            String dot;
            String dash;

            int index =signals.indexOf("?");

            if(index == -1) {
                String letter = mapMorse.get(signals);
                if(letter != null) codMorse.add(letter);
                return codMorse;
            }

            else{
                dot = signals.substring(0, index)+"."+signals.substring(index + 1);
                dash = signals.substring(0, index)+"-"+signals.substring(index + 1);
            }

            codMorse.addAll(possibilities(dot));
            codMorse.addAll(possibilities(dash));
            return codMorse;
        }



    }

