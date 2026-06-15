package e0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import com.google.android.gms.common.api.Api;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* compiled from: EmojiTextWatcher.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    private final EditText f24829a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f24830b;

    /* renamed from: c  reason: collision with root package name */
    private d.e f24831c;

    /* renamed from: d  reason: collision with root package name */
    private int f24832d = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: e  reason: collision with root package name */
    private int f24833e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f24834f = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiTextWatcher.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        private final Reference<EditText> f24835a;

        a(EditText editText) {
            this.f24835a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.e
        public void b() {
            super.b();
            g.b(this.f24835a.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(EditText editText, boolean z10) {
        this.f24829a = editText;
        this.f24830b = z10;
    }

    private d.e a() {
        if (this.f24831c == null) {
            this.f24831c = new a(this.f24829a);
        }
        return this.f24831c;
    }

    static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.d.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        return (this.f24834f && (this.f24830b || androidx.emoji2.text.d.h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.f24834f != z10) {
            if (this.f24831c != null) {
                androidx.emoji2.text.d.b().t(this.f24831c);
            }
            this.f24834f = z10;
            if (z10) {
                b(this.f24829a, androidx.emoji2.text.d.b().d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f24829a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int d10 = androidx.emoji2.text.d.b().d();
        if (d10 != 0) {
            if (d10 == 1) {
                androidx.emoji2.text.d.b().r((Spannable) charSequence, i10, i10 + i12, this.f24832d, this.f24833e);
                return;
            } else if (d10 != 3) {
                return;
            }
        }
        androidx.emoji2.text.d.b().s(a());
    }
}
