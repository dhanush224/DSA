class Twitter {

    private HashMap<Integer,List<Integer>> userPosts = new HashMap<>();
    private HashMap<Integer,HashSet<Integer>> following = new HashMap<>();
    private HashMap<Integer,Integer> tweetTime = new HashMap();
    private PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));
    private int time=0;

    public Twitter() {
        
    }
    
    public void postTweet(int userId, int tweetId) {
        List<Integer> list = new ArrayList<>();
        if(userPosts.containsKey(userId)){
            list = userPosts.get(userId);
        }
        list.add(tweetId);
        userPosts.put(userId,list);
        tweetTime.put(tweetId,time);
        time++;        
    }
    
    public List<Integer> getNewsFeed(int userId) {
        if(userPosts.containsKey(userId)){
        for(int tweet: userPosts.get(userId)){
            pq.add(new int[]{tweet,tweetTime.get(tweet)});
            if(pq.size()>10) pq.remove();
        }}
        if(following.containsKey(userId)){
        for(int followee: following.get(userId)){
            if(userPosts.containsKey(followee)){
            for(int tweet: userPosts.get(followee)){
                pq.add(new int[]{tweet,tweetTime.get(tweet)});
                if(pq.size()>10) pq.remove();
            }}
        }
        }
        List<Integer> list = new ArrayList<>();
        PriorityQueue<int[]> reversed = new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));
        while(!pq.isEmpty()){
            int[] arr = pq.remove();
            arr[1]=-1*arr[1];
            reversed.add(arr);
        }
        while(!reversed.isEmpty()){
            int[] arr = reversed.remove();
            list.add(arr[0]);
        }
        return list;
        
    }
    
    public void follow(int followerId, int followeeId) {
        if(followerId==followeeId) return;
        HashSet<Integer> list = new HashSet<>();
        if(following.containsKey(followerId)){
            list = following.get(followerId);
        }
        list.add(followeeId);
        following.put(followerId,list);        
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(!following.containsKey(followerId)) return;
        if(followerId==followeeId) return;
        if(following.containsKey(followerId)){
        HashSet<Integer> list = following.get(followerId);
        list.remove(Integer.valueOf(followeeId));
        following.put(followerId,list);

        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */