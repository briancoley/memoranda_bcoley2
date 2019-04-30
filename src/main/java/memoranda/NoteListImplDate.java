// TASK 3-2 SMELL BETWEEN CLASSES
package main.java.memoranda;

import main.java.memoranda.interfaces.IProject;
import nu.xom.Document;
import nu.xom.Element;

public class NoteListImplDate {
    public IProject _project;
    public Document _doc;
    public Element _root;

    public NoteListImplDate(IProject _project, Document _doc, Element _root) {
        this._project = _project;
        this._doc = _doc;
        this._root = _root;
    }
}
// TASK 3-2 SMELL BETWEEN CLASSES