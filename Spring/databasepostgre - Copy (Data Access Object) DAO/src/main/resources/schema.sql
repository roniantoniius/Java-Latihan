DROP TABLE IF EXISTS "kapal";
DROP TABLE IF EXISTS "ppn";

CREATE TABLE "ppn" (
	"id" bigint DEFAULT nextval('ppn_id_seq') NOT NULL,
	"name" text,
	"lokasi" text,
	CONSTRAINT "ppn_key" PRIMARY KEY ("id")
);

CREATE TABLE "kapal" (
	"idkapal" bigint DEFAULT nextval('kapal_id_seq') NOT NULL,
	"namekapal" text,
	"ukuran" text,
	"ppnid" bigint,
	CONSTRAINT "kapal_pkey" PRIMARY KEY ("idkapal"),
	CONSTRAINT "fk_ppn" FOREIGN KEY (ppnid)
	REFERENCES ppn(id)
);