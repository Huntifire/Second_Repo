package Second_Repo;

public class MergeSorting {
    public static void main(String[] args) {
    int[] a = {2,5,6,9};
    int[] b = {1,3,4,5,7,8};
    int[] c = new int[a.length+b.length];       

    merge(c,a,b);
    for(int h = 0;h<c.length;h++){
        System.out.print(c[h]+" ");
    }
}

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0,j =  0,k = 0;
        while (i<a.length && j<b.length) {
            if (a[i]<b[j]) c[k++] = a[i++];    
            else c[k++] = b[j++]; 
        }
        if (i==a.length) { // a array khatm, ab b ke bache hue elements lo.
            while (j<b.length) c[k++] = b[j++]; 
        }
        if (j == b.length){
            while (i<a.length) c[k++] = a[i++];
        }
    }
}
