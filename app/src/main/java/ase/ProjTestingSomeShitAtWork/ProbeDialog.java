package ase.ProjTestingSomeShitAtWork;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.*;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

public class ProbeDialog extends DialogFragment implements OnClickListener{

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    final String SETTINGS_FILE_NAME = "mysettings.txt";

    public Dialog onCreateDialog(Bundle savedInstanceState){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
                .setTitle("Вы активно пользуетесь приложением")
                .setMessage("Могли бы Вы поставить оценку приложению?")
                .setNeutralButton("Позже", this)
                .setPositiveButton("Ok", this);
        return builder.create();
    }
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i){
            case Dialog.BUTTON_NEUTRAL:
                setCounterToZero();
                break;
            case Dialog.BUTTON_POSITIVE:
                //заморозить счетчик
                break;
        }
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        setCounterToZero();
        super.onCancel(dialog);
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        setCounterToZero();
        super.onDismiss(dialog);
    }

    private void setCounterToZero() {
        sharedPreferences = this.getActivity().getSharedPreferences(SETTINGS_FILE_NAME, MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putInt("counter",0);
        editor.apply();
    }
}
