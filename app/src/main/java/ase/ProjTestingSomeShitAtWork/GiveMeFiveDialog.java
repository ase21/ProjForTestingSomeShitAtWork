package ase.ProjTestingSomeShitAtWork;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.app.DialogFragment;

public class GiveMeFiveDialog extends DialogFragment implements DialogInterface.OnClickListener{

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

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
            case Dialog.BUTTON_POSITIVE:
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=asefactory.ase21.bsacalculator")));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=asefactory.ase21.bsacalculator")));
                }
                break;
            case Dialog.BUTTON_NEUTRAL:

                break;
        }

    }
}
