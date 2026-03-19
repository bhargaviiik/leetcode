class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        char [] genes= {'A', 'C', 'G', 'T'};
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<bank.length;i++){
            set.add(bank[i]);
        }
        if (!set.contains(endGene)) return -1;
        Queue<String> q= new LinkedList<>();
        q.offer(startGene);
        int size=1;
        int mutations=0;
        while(!q.isEmpty()){
            size=q.size();
            for(int i=0;i<size;i++){  //all the words in current queue size-> gonna have same no. of mutations
                String curr=q.poll();
                if(curr.equals(endGene)) return mutations;
                char[] current= curr.toCharArray();
                for(int j=0;j<8;j++){  //generating all possible sequences through current word after a single mutation
                    char orig=current[j];
                    for(char c: genes){
                        current[j]=c;
                        String next=new String(current);
                        if(set.contains(next)){
                            q.offer(next);
                            set.remove(next); //since this variation is already taken, we dont have to take the same variation again
                        }
                    }
                    current[j]=orig;
                }
            }
            mutations++;
        }
        return -1;
    }
}