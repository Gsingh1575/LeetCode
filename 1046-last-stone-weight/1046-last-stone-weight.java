class Solution {
    public int lastStoneWeight(int[] stones) {
    int n = stones.length;
    buildHeap(stones, n);
    while(n > 1){
        int a = stones[0];
        swap(stones, 0, n - 1);
        heapify(stones, 0, n - 1);
        int b = stones[0];
        swap(stones, 0, n - 2);
        heapify(stones, 0, n - 2);
        n -= 2;
        if(a != b){
            a -= b;
            stones[n++] = a;
            buildHeap(stones, n);
        }
    }
    return n == 0 ? 0 : stones[0];
}

void buildHeap(int[] arr, int n){
    for(int i = n / 2; i >= 0; i--){
        heapify(arr, i, n);
    }
}

void heapify(int[] arr, int i, int n){
    int l = i * 2 + 1;
    int r = i * 2 + 2;
    int max = i;
    if(r < n){
        if(arr[r] > arr[max]) max = r;
    }
    if(l < n){
        if(arr[l] > arr[max]) max = l;
    }
    if(max != i) {
        swap(arr, i, max);
        heapify(arr, max, n);
    }
}

void swap(int[] arr, int a, int b){
    int x = arr[a];
    arr[a] = arr[b];
    arr[b] = x;
}
}