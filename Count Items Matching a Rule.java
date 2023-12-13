class Solution {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        int index = 0;

        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            default:
                index = 2;
        }
        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue))
                result++;
        }

        return result;
    }
}



