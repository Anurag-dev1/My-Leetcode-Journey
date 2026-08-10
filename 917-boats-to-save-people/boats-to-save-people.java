class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int i=0;
        int j=people.length-1;

        int count=0;
        while(i<=j){
            if((people[j]+people[i])<=limit){
                count++;
                i++;
                j--;
            }else if(people[j]+people[i]>limit){
                count++;
                j--;
            }
        }
        return count;
    }
}