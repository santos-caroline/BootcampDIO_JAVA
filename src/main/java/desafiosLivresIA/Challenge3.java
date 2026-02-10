package desafiosLivresIA;

public class Challenge3 {

    public static String sevenSegmentify(String time) {

        StringBuilder sevenSegmentsTime = new StringBuilder();
        StringBuilder segment1 = new StringBuilder();
        StringBuilder segment2 = new StringBuilder();
        StringBuilder segment3 = new StringBuilder();

        String line1 = "";
        String line2 = "";
        String line3 = "";
        String underline = "_";
        String pipe = "|";
        String space = " ";
        String dot = ".";


        for (int position = 0; position < time.length(); position++) {
            if (time.charAt(position) == ':') {
                segment1.append(space + space + space);
                segment2.append(space + dot + space);
                segment3.append(space + dot + space);
                continue;
            }

            int digit = time.charAt(position) - '0'; // conversão do ASCII

            if(position == 0 && digit == 0){
                segment1.append(space + space + space);
                segment2.append(space + space + space);
                segment3.append(space + space + space);
                continue;
            }
            switch (digit) {
                case 1: {
                    line1 = space + space + space;
                    line2 = space + space + pipe;
                    line3 = space + space + pipe;
                    break;
                }
                case 2: {
                    line1 = space + underline + space;
                    line2 = space + underline + pipe;
                    line3 = pipe + underline + space;
                    break;
                }
                case 3: {
                    line1 = space + underline + space;
                    line2 = space + underline + pipe;
                    line3 = space + underline + pipe;
                    break;
                }
                case 4: {
                    line1 = space + space + space ;
                    line2 = pipe + underline + pipe;
                    line3 = space + space + pipe;
                    break;
                }
                case 5: {
                    line1 = space + underline + space;
                    line2 = pipe + underline + space;
                    line3 = space + underline + pipe;
                    break;
                }
                case 6: {
                    line1 = space + underline + space;
                    line2 = pipe + underline + space;
                    line3 = pipe + underline + pipe;
                    break;
                }
                case 7: {
                    line1 = space + underline + space;
                    line2 = space + space + pipe;
                    line3 = space + space + pipe;
                    break;
                }
                case 8: {
                    line1 = space + underline + space;
                    line2 = pipe + underline + pipe;
                    line3 = pipe + underline + pipe;
                    break;
                }
                case 9: {
                    line1 = space + underline + space;
                    line2 = pipe + underline + pipe;
                    line3 = space + underline + pipe;
                    break;
                }
                case 0: {
                    line1 = space + underline + space;
                    line2 = pipe + space + pipe;
                    line3 = pipe + underline + pipe;
                    break;
                }

            }

            segment1.append(line1);
            segment2.append(line2);
            segment3.append(line3);
        }
        sevenSegmentsTime.append(segment1).append("\n");
        sevenSegmentsTime.append(segment2).append("\n");
        sevenSegmentsTime.append(segment3);
        return sevenSegmentsTime.toString();

    }

}

