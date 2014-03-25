/**
 * Created by Administrator on 14-3-17.
 */
var app=angular.module("myApp");
app.controller('ListController',function($scope,$http){
    $scope.users=[];
    $http.get("http://localhost:3000/db/users")
        .success(function(data){
            if(data.length==0){
                $scope.users=[{'name':'dzr'}];
            }
            else{
                $scope.users=data;
            }
        })
});
app.controller('CreateController',function($scope,$http){
    $scope.user={}
    $scope.create=function(){
        $http.post("http://localhost:3000/db/users",$scope.user)
            .success(function(data){
                $scope.user={};
                $scope.message="create success!";
            })
            .error(function(){
                $scope.message="create failed!";
            })
    };
});

app.controller('FormController',function($scope){
    $scope.fields = [
        {placeholder: 'Username', isRequired: true},
        {placeholder: 'Password', isRequired: true},
        {placeholder: 'Email (optional)', isRequired: false}
    ];

    $scope.submitForm = function(){
        alert("it works!");
    };
});