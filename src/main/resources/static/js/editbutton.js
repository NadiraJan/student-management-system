
                        update: {
                            url: crudServiceBaseUrl + "/Products/Update",
                            dataType: "jsonp"
                        },
                        destroy: {
                            url: crudServiceBaseUrl + "/Products/Destroy",
                            dataType: "jsonp"
                        },
                        create: {
                            url: crudServiceBaseUrl + "/Products/Create",
                            dataType: "jsonp"
                        },
                        parameterMap: function(options, operation) {
                            if (operation !== "read" && options.models) {
                                return {models: kendo.stringify(options.models)};
                            }
                        }
                    },
                    pageSize: 10,
                    schema: {
                        model: {
                            id: "ProductID",
                            fields: {
                                ProductID: { editable: false, nullable: true },
                                ProductName: "ProductName",
                                UnitPrice: { type: "number" },
                                Discontinued: { type: "boolean" },
                                UnitsInStock: { type: "number" }
                            }
                        }
                    }
                });


            $("#pager").kendoPager({
                dataSource: dataSource
            });

            var listView = $("#listView").kendoListView({
                dataSource: dataSource,
                template: kendo.template($("#template").html()),
                editTemplate: kendo.template($("#editTemplate").html())
            }).data("kendoListView");

            $(".k-add-button").click(function(e) {
                listView.add();
                e.preventDefault();
            });

