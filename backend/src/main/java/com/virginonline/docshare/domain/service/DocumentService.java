package com.virginonline.docshare.domain.service;

import com.virginonline.docshare.domain.entity.document.Document;
import java.util.UUID;

public interface DocumentService {

  void uploadDocument();
  Document updateDocument();
  Boolean deleteDocumentById(UUID id);

}
