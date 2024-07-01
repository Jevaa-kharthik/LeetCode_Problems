import java.util.ArrayList;
import java.util.List;

public class Text_Justification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> current_words = new ArrayList<>();
        int length_of_current_line = 0;

        for(String word : words){
            if(current_words.size() + length_of_current_line + word.length() > maxWidth){
                int totalSpace = maxWidth - length_of_current_line;
                int gaps = current_words.size() - 1;
                if(gaps == 0){
                    result.add(current_words.get(0) + " ".repeat(totalSpace));
                }
                else{
                    int prepare_gaps = totalSpace / gaps;
                    int extraSpace = totalSpace % gaps;
                    StringBuilder sb = new StringBuilder();

                    for(int i = 0; i < current_words.size(); i++){
                        sb.append(current_words.get(i));
                        if(i < gaps){
                            sb.append(" ".repeat(prepare_gaps));
                            if(i < extraSpace){
                                sb.append(" ");
                            }
                        }
                    }
                    result.add(sb.toString());
                }
                current_words.clear();
                length_of_current_line = 0;
            }
            current_words.add(word);
            length_of_current_line += word.length();
        }
        StringBuilder last_line = new StringBuilder(String.join(" ", current_words));
        while(last_line.length() < maxWidth){
            last_line.append(" ");
        }
        result.add(last_line.toString());
        return result;
    }
}
