package ru.samsung.itschool.spacearrays;

        import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity0 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageManager.resources = getResources();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
    }
    public void change(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
