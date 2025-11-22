package Interface.LamdaExpression;

public class Lmda implements LamdaFuncInterface {
//lamda is similar to a arrow function in js




    static void main(String[] args) {
        LamdaFuncInterface func = new Lmda(){
            @Override
            public void show() {
                super.show();
            }
        };


        func.show();
    }

    @Override
    public void show() {

    }
}
