package com.training.holdingYourObjects;

import java.util.*;

public class Main {

//    public static void commandEater(Queue<Command> qc) {
//        while(qc.peek() != null)                              Exercise 27
//            qc.poll().operation();
//    }

    public static void main(String[] args) {

//        List<Gerbil> groupOfGerbil = new ArrayList<>();
//
//        for (int i = 1; i < 11; i++){
//            groupOfGerbil.add(new Gerbil(i));
//        }                                         Exercise 1
//
//        for (int i = 0; i < 10; i++){
//            groupOfGerbil.get(i).hop();
//        }

//        Generator gen = new Generator();
//        String[] a = new String[10];
//        gen.fillA(a);
//        for(String s : a) System.out.print(s + ", ");
//        System.out.println();
//        System.out.println(gen.fill(new ArrayList<String>(), 10));
//        System.out.println(gen.fill(new LinkedList<String>(), 10));           Exercise 4
//        System.out.println(gen.fill(new HashSet<String>(), 10));
//        System.out.println(gen.fill(new LinkedHashSet<String>(), 10));
//        System.out.println(gen.fill(new TreeSet<String>(), 10));

//        Simple[] simpleArray = new Simple[10];
//        for (int i = 0; i < 10; i++){
//            simpleArray[i] = new Simple();
//        }
//
//        List<Simple> simpleList = new ArrayList<>(Arrays.asList(simpleArray));    Exercise 7
//        List<Simple> simpleSublist = new ArrayList<>(simpleList.subList(0, 5));
//        simpleList.removeAll(simpleSublist);
//
//        for (Simple elem: simpleList){
//            System.out.println(elem.getId());
//        }

//        List<Gerbil> gerbilList = new ArrayList<>();
//
//        for (int i = 1; i < 11; i++){
//            gerbilList.add(new Gerbil(i));
//        }
//                                                                                  Exercise 8
//        Iterator<Gerbil> gerbilIterator = gerbilList.iterator();
//
//        while (gerbilIterator.hasNext()){
//            gerbilIterator.next().hop();
//        }

//        ArrayList<Integer> al =
//                new ArrayList<Integer>(Arrays.asList(1, 2, 3));
//        LinkedList<Character> ll =
//                new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));
//        HashSet<Float> hs =
//                new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
//        TreeSet<Double> ts =                                                      Exercise 11
//                new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
//        LinkedHashSet<Integer> lhs =
//                new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));
//
//        JustForTheMethod.stepThrough(al);
//        JustForTheMethod.stepThrough(ll);
//        JustForTheMethod.stepThrough(hs);
//        JustForTheMethod.stepThrough(ts);
//        JustForTheMethod.stepThrough(lhs);

        /*
         * Exercise:     12
         * Description:  Create and populate a List<Integer>. Create a second List<Integer>
         *               of the same size as the first, and use ListIterators to read elements from the first List and
         *               insert them into the second in reverse order. (You may want to explore a number of different
         *               ways to solve this problem.)
         */

//        List<Integer> firstOne = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15));
//        List<Integer> secondOne = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8, 9));
//
//        ListIterator it1 = firstOne.listIterator(firstOne.size());
//        ListIterator it2 = secondOne.listIterator();
//
//        while(it1.hasPrevious()){                                 Exercise 12
//            it2.next();
//            it2.set(it1.previous());
//        }
//
//        for (Integer x: secondOne){
//            System.out.println(x);
//        }


//        LinkedList<Integer> ll = new LinkedList<>();
//        ListIterator listIterator = ll.listIterator(ll.size()/2);
//                                                                                 Exercise 14
//        for(int i = 0; i < 10; i++){
//            listIterator.add(i);
//        }


//        String expression = "+U+n+c---+e+r+t---+a+i+n+t+y---+ -+r+u--+l+e+s---";
//        Stack<Character> customStack = new Stack<>();
//
//        for (int i = 0; i < expression.length(); i++){
//            switch (expression.charAt(i)){
//                case '+':
//                    customStack.push(expression.charAt(i+1));
//                    i++;
//                    break;
//                case '-':                                                 Exercise 15
//                    customStack.pop();
//                    break;
//                default:
//                    i++;
//            }
//        }
//
//        while(!customStack.empty()){
//            System.out.print(customStack.pop()+" ");
//        }

//        Set<Integer> simpleSet = new HashSet<>();
//
//        Random rand = new Random(47);
//
//        for (int i = 0; i < 100; i++){
//            simpleSet.add(rand.nextInt(30));
//        }
//
////        Iterator it = simpleSet.iterator();
////        while (it.hasNext()){
////            System.out.print(it.next()+" ");
////        }
//
//        System.out.println(simpleSet);

//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter the word which you wish: ");
//        String word = input.nextLine();
//
//        int count = 0;
//                                                                          Exercise 16
//        for (int i = 0; i < word.length(); i++){
//            if (UniqueWords.vowels.contains(word.charAt(i))){
//                count++;
//            }
//        }
//
//        System.out.println(count);

//        Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
//        gerbils.put("Fuzzy", new Gerbil(0));
//        gerbils.put("Spot", new Gerbil(1));
//        gerbils.put("Speedy", new Gerbil(2));
//        gerbils.put("Dopey", new Gerbil(3));                              Exercise 17
//        gerbils.put("Sleepy", new Gerbil(4));
//        gerbils.put("Happy", new Gerbil(5));
//        Iterator<String> it = gerbils.keySet().iterator();
//        while(it.hasNext()) {
//            String s = it.next();
//            System.out.print(s + ": ");
//            gerbils.get(s).hop();

//        Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
//        gerbils.put("Fuzzy", new Gerbil(0));
//        gerbils.put("Spot", new Gerbil(1));
//        gerbils.put("Speedy", new Gerbil(2));
//        gerbils.put("Dopey", new Gerbil(3));
//        gerbils.put("Sleepy", new Gerbil(4));
//        gerbils.put("Happy", new Gerbil(5));
//        gerbils.put("Funny", new Gerbil(6));
//        gerbils.put("Silly", new Gerbil(7));
//        gerbils.put("Goofy", new Gerbil(8));
//        gerbils.put("Wowee", new Gerbil(9));
//        System.out.println(gerbils);
//        System.out.println();
//        Set<String> sortedKeys =
//                new TreeSet<String>(gerbils.keySet());
//        System.out.println(sortedKeys);
//        System.out.println();                                             Exercise 18
//        Map<String, Gerbil> sortedGerbils =
//                new LinkedHashMap<String, Gerbil>();
//        for(String s : sortedKeys) {
//            System.out.print("Adding " + s + ", ");
//            sortedGerbils.put(s, gerbils.get(s));
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println(sortedGerbils);
//        System.out.println();
//        // or, just:
//        Map<String, Gerbil> sortedGerbils2 =
//                new TreeMap<String, Gerbil>(gerbils);
//        System.out.println(sortedGerbils2);

//        Map<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
//        gerbils.put("Fuzzy", new Gerbil(0));
//        gerbils.put("Spot", new Gerbil(1));
//        gerbils.put("Speedy", new Gerbil(2));
//        gerbils.put("Dopey", new Gerbil(3));
//        gerbils.put("Sleepy", new Gerbil(4));
//        gerbils.put("Happy", new Gerbil(5));
//        gerbils.put("Funny", new Gerbil(6));
//        gerbils.put("Silly", new Gerbil(7));
//        gerbils.put("Goofy", new Gerbil(8));
//        gerbils.put("Wowee", new Gerbil(9));
//        System.out.println(gerbils);
//        System.out.println();
//        Set<String> hashedKeys =
//                new HashSet<String>(gerbils.keySet());
//        System.out.println("HashSet: " + hashedKeys);
//        System.out.println();
//        Map<String, Gerbil> hashedGerbils =
//                new LinkedHashMap<String, Gerbil>();
//        for(String s : hashedKeys) {
//            System.out.print("Adding " + s + ", ");
//            hashedGerbils.put(s, gerbils.get(s));
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println("From HashSet: " + hashedGerbils);
//                                                                              Exercise 19
//        System.out.println();
//        Set<String> linkedHashedKeys =
//                new LinkedHashSet<String>(gerbils.keySet());
//        System.out.println("LinkedHashSet: " + linkedHashedKeys);
//        System.out.println();
//        Map<String, Gerbil> linkedHashedGerbils =
//                new LinkedHashMap<String, Gerbil>();
//        for(String s : linkedHashedKeys) {
//            System.out.print("Adding " + s + ", ");
//            linkedHashedGerbils.put(s, gerbils.get(s));
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println("From LinkedHashSet: "
//                + linkedHashedGerbils);

//            Build b = new Build(); // Exercise 27,
//                                   // please also uncomment the lines 7-10, to make the code compile
//           commandEater(b.makeQ());

//        Random rand = new Random();
//        PriorityQueue<Double> d = new PriorityQueue<Double>();
//        for(int i = 0; i < 10; i++)                                           Exercise 28
//            d.offer(rand.nextDouble() * i);
//        while(d.peek() != null)
//            System.out.print(d.poll() + " ");

//        PriorityQueue<Simple> s = new PriorityQueue<Simple>();
//        // OK to add one Simple:
//        s.offer(new Simple());                                                Exercise 29
//        // but no more allowed; get runtime exception:
//        // Simple cannot be cast to Comparable:
//        s.offer(new Simple());
    }
}

