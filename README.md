# learningJava2022
Our goals was to make an app that was similar to Akinator. The akinator game tells the user to keep a character in mind(preferably celebrities and TV show characters), and then asks a series of questions to pinpoint who the user is thinking about. We replicated that game, but for all the people in this classroom. There were many ways to approach this problem, but we wanted to maximize the amount we learned from this project, so we implemented many string parameters in our code. First, we created an ArrayList of Person Objects, called all People. Each Person Object consists of an Eye, Hair, Name, and Height, and Glasses strings. Then, we asked the entire class to fill out our survey to fill up the ArrayList with everyone in the classroom, with all the characteristics that we needed. Then, we created separate text files with all the physical characteristics of each person. Next, we made each text file into an ArrayList using the import File method. We then added all of these characteristics to the ArrayList. Then, we implemented a series of while loops and methods to randomly choose a question category(Eye question, Hair question, etc.), to which the user would have to answer yes or no. After the user answered, the program would remove everyone in the ArrayList that didn’t apply to the user’s answer (Eg. If the user answered “no” to the question that asked him ”Do you have blue eyes”, then the program would remove eve). This process would continue until the program narrows down the ArrayList to 1 person, which it would then display their name.

