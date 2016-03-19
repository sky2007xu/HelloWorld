package com.xu.idea;

/**
 * Created by sky-fly on 2016/3/2.
 */
public class TestIDEA {

    private static volatile TestIDEA idea = null;

    private TestIDEA(){ }

    public static TestIDEA getTestIDEAInstance( ){
        if (idea == null){
            synchronized (TestIDEA.class){
                if (idea == null) {
                    idea = new TestIDEA();
                }
            }
        }
        return idea;
    }

}
