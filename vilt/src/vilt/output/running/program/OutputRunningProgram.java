package vilt.output.running.program;

public class OutputRunningProgram {

    public static void main(String[] args) {

        MyClass x = new MyClass("X");
        MyClass y = new MyClass("Y");
        MyClass z = new MyClass("Z");

        System.out.println(x.GetName()+ ": " + x.GetInstanceCount());
        System.out.println(y.GetName()+ ": " + y.GetInstanceCount());
        System.out.println(z.GetName()+ ": " + z.GetInstanceCount());

        y.name = "YYY";
        System.out.println(y.GetName() + " : " + y.GetInstanceCount());

        x.name = "ZZZ";
        System.out.println(x.GetName() + " : " + x.GetInstanceCount());
    }

    public static class MyClass{

        public  int instanceCount = 0;

        public String name;

        public String GetName(){
            return name;
        }

        public MyClass(String name){
            instanceCount++;
            this.name = name;
        }

        public int GetInstanceCount(){
            return instanceCount++;
        }
    }




}
