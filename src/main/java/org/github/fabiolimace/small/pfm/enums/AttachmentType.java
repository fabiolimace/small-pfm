package org.github.fabiolimace.small.pfm.enums;

public enum AttachmentType {
	
	TXT('T', "txt", "text/plain"),
	HTM('H', "html", "text/html"),
	MD('M', "md", "text/markdown"),
	JPG('J', "jpg", "image/jpeg"),
	PNG('N', "png", "image/png"),
	PDF('P', "pdf", "application/pdf"),
	ZIP('Z', "zip", "application/zip");

	private char value;
	private String extension;
	private String mediaType;

	AttachmentType(char value, String extension, String mediaType) {
		this.value = value;
		this.extension = extension;
		this.mediaType = mediaType;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
}
