package com.prmncr.normativecontrol.services;

import com.prmncr.normativecontrol.dtos.Document;
import com.prmncr.normativecontrol.dtos.FailureType;
import com.prmncr.normativecontrol.dtos.Result;
import com.prmncr.normativecontrol.dtos.State;
import com.prmncr.normativecontrol.components.DocumentParserBuilder;
import lombok.AllArgsConstructor;
import lombok.val;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;

@Service
@AllArgsConstructor
public class DocumentHandler {
    private final DocumentParserBuilder factory;

    public void handle(Document document) {
        WordprocessingMLPackage docx;
        try {
            docx = WordprocessingMLPackage.load(new ByteArrayInputStream(document.getFile()));
        } catch (Docx4JException e) {
            document.setState(State.ERROR);
            document.setResult(new Result(FailureType.FILE_READING_ERROR));
            return;
        }
        val parser = factory.build(docx);
        val errors = parser.runStyleCheck();
        document.setResult(new Result(errors));
    }
}
