package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SupportErrorDialogFragment extends androidx.fragment.app.c {
    private Dialog A0;
    private DialogInterface.OnCancelListener B0;
    private Dialog C0;

    public static SupportErrorDialogFragment l2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.n(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.A0 = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.B0 = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // androidx.fragment.app.c
    public Dialog d2(Bundle bundle) {
        Dialog dialog = this.A0;
        if (dialog == null) {
            i2(false);
            if (this.C0 == null) {
                this.C0 = new AlertDialog.Builder((Context) Preconditions.m(p())).create();
            }
            return this.C0;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.c
    public void k2(FragmentManager fragmentManager, String str) {
        super.k2(fragmentManager, str);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.B0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
