     package PracticePractice.Replit1;

     public class replit_169 {
         public static void main(String[] args) {
        /*This method gets a string and returns the word count of that string.
            example:
            wordCount("foo bar")
            returns 2
            wordCount("one two three")
            returns 3
            wordCount("bla")
            returns 1
            hint:
            https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)

         */
                int count=wordCount("one, two, four, three");
                System.out.println(count);
            }

            public static int wordCount(String words) {

                String[]words1=words.split(" ");
                return words1.length;
            }

        }

