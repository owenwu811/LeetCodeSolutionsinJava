//1352
//Medium

//Design an algorithm that accepts a stream of integers and retrieves the product of the last k integers of the stream.

//Implement the ProductOfNumbers class:

//ProductOfNumbers() Initializes the object with an empty stream.
//void add(int num) Appends the integer num to the stream.
//int getProduct(int k) Returns the product of the last k numbers in the current list. You can assume that always the current list has at least k numbers.
//The test cases are generated so that, at any time, the product of any contiguous sequence of numbers will fit into a single 32-bit integer without overflowing.



// my own solution using java:

// just get the difference of the list minus k and start from that point to get exactly the rightmost k product, and multiply from 1, not 0

class ProductOfNumbers {
    ArrayList<Integer> ar = new ArrayList<>();

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        ar.add(num);
        
    }
    
    public int getProduct(int k) {
        int diff = ar.size() - k;
        int ans = 1;
        for (int i = diff; i < ar.size(); i++) {
            ans *= ar.get(i);
        }
        return ans;
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
