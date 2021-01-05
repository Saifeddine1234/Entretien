package algo1;

public class algo1 {
   
    public final int[] algo1(int N, int[] A) {
        Calcule c = new Calcule(N);
        for (int i = 0; (i < A.length); i++) {
            if ((A[i] <= N)) {
                c.Increase(A[i]);
            }
            else {
                c.AllC();
            }    
        }
        return c.ToArray();
    }
    
    public class Calcule {
        private int[] c;
        private int greaterValueInC = 0;
        public Calcule(int length) {
            this.c = new int[length];
        }
        public final void AllC() {
            for (int i = 0; (i < this.c.length); i++) {
                this.c[i] = this.greaterValueInC;
            }
        }
        public final void Increase(int cPosition) {
            cPosition--;
            this.c[cPosition]++;
            if ((this.c[cPosition] > this.greaterValueInC)) {
                this.greaterValueInC = this.c[cPosition];
            }        
        }
        public final int[] ToArray() {
            return ((int[])(this.c));
        }
    }
}
