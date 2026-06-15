package q;

import android.view.View;
/* compiled from: Debug.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a {
    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
