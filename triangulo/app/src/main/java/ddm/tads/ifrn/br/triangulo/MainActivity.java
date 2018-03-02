package ddm.tads.ifrn.br.triangulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcular;
    private EditText editBase, editAltura, editArea;

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int base = Integer.parseInt(editBase.getText().toString());
            int altura = Integer.parseInt(editAltura.getText().toString());
            double area = (base * altura)/2d;
            editArea.setText("" + area);
            editBase.setText("");
            editAltura.setText("");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        editBase = (EditText) findViewById(R.id.editBase);
        editAltura = (EditText) findViewById(R.id.editAltura);
        editArea = (EditText) findViewById(R.id.editArea);

        btnCalcular.setOnClickListener(listener);

    }


}
