package in.nit.controller;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class schema {

	MetadataSources metadataSources = new MetadataSources(serviceRegistry);
	metadataSources.addAnnotatedClass(Account.class);
	metadataSources.addAnnotatedClass(AccountSettings.class);
	Metadata metadata = metadataSources.buildMetadata();

	SchemaExport schemaExport = new SchemaExport();
	schemaExport.setFormat(true);
	schemaExport.setOutputFile("create.sql");
	schemaExport.createOnly(EnumSet.of(TargetType.SCRIPT), metadata);
}
