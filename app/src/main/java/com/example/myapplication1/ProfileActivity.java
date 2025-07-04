//Trial for Button Cancelar and Button "Crear Cuenta"
package com.example.myapplication1;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity{


@Override
    protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.screen_profile);

    // Get references to your views
    TextView new_user_name = findViewById(R.id.txtNewUserName);
    TextView user_email = findViewById(R.id.txtNewUserEmail);
    TextView newPassword = findViewById(R.id.txtNewPassword);
    TextView reenterPassword = findViewById(R.id.txtReenterNewPassword);
    Button createAccount = findViewById(R.id.btnCreateAccount);
    Button cancel = findViewById(R.id.btnCancelNewAccount);
    //initialize widgets

    new_user_name.setText("Coloque su nombre");
    newPassword.setText("Enter new password");
    reenterPassword.setText("Re-enter new password");
    user_email.setText("example@gmal.com");


    // How to get text from a TextView (for display purposes):
    //String textFromTextView = myTextView.getText().toString();

            // How to get input from an EditText when a button is clicked:


            //Button btn = findViewById(R.id.btnCreateAccount);

            //btn.setOnClickListener(new View.OnClickListener() {
    cancel.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            //Cambia SecondActivity.class por el nombre de tu segunda actividad
            new_user_name.setText("");
            newPassword.setText("");
            reenterPassword.setText("");
        }  //String inputText = myEditText.getText().toString();

    });                                        // Display the input in another TextView
    //resultTextView.setText("You entered: " + inputText);

    // You can also perform actions with this input, e.g., print to log
    //Log.d(TAG, "Input from EditText: " + inputText);

    // If the input is expected to be a number, you'll need to parse it:
    //codigo de abajo es util
                /*try {
                    int numberInput = Integer.parseInt(inputText); // For integers
                    // Or: double decimalInput = Double.parseDouble(inputText); // For floating-point numbers
                    // Use the number...
                    Log.d(TAG, "Parsed number: " + numberInput);
                } catch (NumberFormatException e) {
                    // Handle cases where the input is not a valid number
                    resultTextView.setText("Please enter a valid number.");
                    Log.e(TAG, "NumberFormatException: " + e.getMessage());
                }

        }
      */
        createAccount.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            //Cambia SecondActivity.class por el nombre de tu segunda actividad
            try {
                String inputText = new_user_name.getText().toString();
                //int numberInput = Integer.parseInt(inputText); // For integers
                // Or: double decimalInput = Double.parseDouble(inputText); // For floating-point numbers
                // Use the number...
              //  Log.d(TAG, "Parsed number: " + numberInput);
            } catch (NumberFormatException e) {
                // Handle cases where the input is not a valid number
               new_user_name.setText("Please enter a valid number.");
                //Log.e(TAG, "NumberFormatException: " + e.getMessage());
            }
        }  //String input Text = myEditText.getText().toString();

    });




    }


}
