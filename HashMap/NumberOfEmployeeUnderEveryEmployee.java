package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NumberOfEmployeeUnderEveryEmployee {
    static HashMap<String, Integer> result = new HashMap<String, Integer>();
    static void populateResult(HashMap<String,String> map){
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String, String> entry = itr.next();
            if(entry.getKey() == entry.getValue()){
                continue;
            }
            result.putIfAbsent(entry.getKey(),0);
            int temp = result.get(entry.getKey()) != null ? result.get(entry.getKey()) : 0;
            result.put((entry.getValue()),result.getOrDefault(entry.getValue(),0)+temp+1);
        }
    }
    public static void main(String[] args)
    {
        HashMap<String, String> dataSet = new HashMap<String, String>();
        dataSet.put("A", "C");
        dataSet.put("B", "C");
        dataSet.put("C", "F");
        dataSet.put("D", "E");
        dataSet.put("E", "F");
        dataSet.put("F", "F");
        dataSet.put("G", "F");
        populateResult(dataSet);
        System.out.println("result = " + result);
    }

}
