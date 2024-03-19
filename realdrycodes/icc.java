import java.util.HashMap;

public class icc {
    public static void main(String[] args) {
        
        int[] empLevels = {1, 2, 3, 3, 3, 3, 6, 7};
        int[] yearsOfExperience = {7, 6, 3, 4, 5, 6, 4, 3};
        char[] empNames = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        
        HashMap<Character, int[]> occurrenceMap = new HashMap<>();

    
        for (int i = 0; i < empLevels.length; i++) {
            if (empLevels[i] == 3) {
                char currentName = empNames[i];
                int[] positions = occurrenceMap.getOrDefault(currentName, new int[2]);
                positions[0] = (positions[0] == 0) ? i + 1 : Math.min(positions[0], i + 1);
                positions[1] = Math.max(positions[1], i + 1);
                occurrenceMap.put(currentName, positions);
            }
        }

        
        for (char name : occurrenceMap.keySet()) {
            int[] positions = occurrenceMap.get(name);
            int occurrences = positions[1] - positions[0] + 1;
            System.out.println("Employee: " + name + ", Occurrences: " + occurrences +
                    ", First Occurrence: " + positions[0] + ", Last Occurrence: " + positions[1]);
        }
    }
}
book allocation lc 1011 