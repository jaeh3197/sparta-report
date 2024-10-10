package week02.collection;

import java.util.*;

public class Report2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        if (Objects.equals(type, "List")) {
            ArrayList<String> strList = new ArrayList<>();
            for (int i = 0; i <= strList.size() ;i++) {
                strList.add(sc.nextLine());
                if (Objects.equals(strList.get(i), "끝")) {
                    strList.remove(i);
                    break;
                }
            }
            for (int j = 0; j < strList.size(); j++) {
                if (j == 0) {
                    System.out.println("[" + "List 로 저장된 " + strList.get(j) + "]");
                } else {
                    System.out.println(j + ". " + strList.get(j));
                }
            }
        } else if (Objects.equals(type, "Set")) {
            Set<String> strSet = new LinkedHashSet<>();
            for (int i = 0; i <= strSet.size() ;i++) {
                strSet.add(sc.nextLine());
                if (strSet.contains("끝")) {
                    strSet.remove("끝");
                    break;
                }
            }
            List<String> strToList = new ArrayList<>(strSet);
            for (int j = 0; j < strSet.size(); j++) {
                if (j == 0) {
                    System.out.println("[" + "Set 으로 저장된 " + strToList.get(j) + "]");
                } else {
                    System.out.println(j + ". " + strToList.get(j));
                }
            }
        } else if (Objects.equals(type, "Map")) {
            Map <Integer, String> mapStr = new HashMap<>();
            for (int i = 0; i <= mapStr.size() ;i++) {
                mapStr.put(i, sc.nextLine());
                if (Objects.equals(mapStr.get(i), "끝")) {
                    mapStr.remove(i);
                    break;
                }
            }
            for (int j = 0; j < mapStr.size(); j++) {
                if (j == 0) {
                    System.out.println("[" + "Map 으로 저장된 " + mapStr.get(j) + "]");
                } else {
                    System.out.println(j + ". " + mapStr.get(j));
                }
            }
        }
    }
}
