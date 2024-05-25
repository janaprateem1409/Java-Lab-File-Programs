//Q4. WAP to find the greatest number of three numbers
package JAVA_Lab_File;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.StringTemplate.STR;
class GreatestOfThreeNumber {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append(STR."\{object}");
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args)
    {
        try {
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
            long t = in.nextLong();
            while (t-- > 0)
            {
                long first_num = in.nextLong();
                long sec_num = in.nextLong();
                long third_num = in.nextLong();

                long largest_num = (first_num > sec_num && first_num > third_num)?first_num : (sec_num>first_num &&sec_num>third_num) ? sec_num : third_num;
                out.println("The largest number among the three numbers is : " + largest_num);
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

