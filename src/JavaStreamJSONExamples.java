import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamJSONExamples {
    public static void main(String[] args) throws Exception {
        Gson gson=new Gson();
        JsonReader reader=new JsonReader(new FileReader("E:\\Masters App. CS 2022-2024\\2022\\Fall 2022\\COMP 6481 PPS\\JavaStreamImportantSnippets\\src\\data.json"));
        JSONDatasetMapper json = (JSONDatasetMapper)gson.fromJson(reader, JSONDatasetMapper.class);

        List<JSONDatasetMapper.Description> arr=json.getPrizes();
//      Count of Nobel Prize winners in Chemistry Category
        long chemistryPrizeWinnerCount=arr.stream()
                .filter(x->x.getCategory().equals("chemistry"))
                .count();
        System.out.println(chemistryPrizeWinnerCount);
//      Printing year of nobel prize winners in chemistry
        arr.stream()
                .filter(x->x.getCategory().equals("chemistry"))
                .map(x->x.getYear())
                .forEach(System.out::println);

//      Printing firstname of nobel prize in chemistry winners (Notice the application of flatmap)
        arr.stream()
                .filter(x -> x.getCategory().equals("chemistry"))
                .map(x -> x.getLaureates())
                .filter(x->(x!=null))
                .flatMap(Collection::stream)
                .filter(x->(x!=null))
                .map(x->x.getSurname())
                .filter(x->(x!=null))
                .filter(x->(!x.isEmpty()))
                .forEach(System.out::println);

//      Printing motivation of Nobel Prize winners who are sharing the prize in two
        arr.stream()
                .filter(x -> x.getCategory().equals("chemistry"))
                .map(x -> x.getLaureates())
                .filter(x->(x!=null))
                .flatMap(Collection::stream)
                .filter(x->(x!=null))
                .filter(x-> ( x.getShare().equals("2") ) )
                .map(x->x.getMotivation())
                .filter(x->(x!=null))
                .filter(x->(!x.isEmpty()))
                .forEach(System.out::println);


    }
}
