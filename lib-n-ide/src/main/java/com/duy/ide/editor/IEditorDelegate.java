package com.duy.ide.editor;

import android.support.annotation.Nullable;

import com.duy.ide.code.api.CodeFormatProvider;
import com.duy.ide.code.api.SuggestionProvider;
import com.duy.ide.editor.view.IEditAreaView;
import com.jecelyin.editor.v2.common.Command;

public interface IEditorDelegate {

    void saveCurrentFile() throws Exception;

    void saveInBackground();

    IEditAreaView getEditText();

    int getCursorOffset();

    Document getDocument();

    void onDocumentChanged();

    boolean isChanged();

    String getPath();

    String getEncoding();

    void doCommand(Command command);

    void setCodeFormatProvider(CodeFormatProvider provider);

    void setSuggestionProvider(@Nullable SuggestionProvider provider);
}