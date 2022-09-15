int peakindex(int arr[], int size){
int s=0,e=size-1;
while(s<e){
int mid=s+(e-s)/2;
if(arr[mid]>arr[mid+1]){
e=mid;
}
else {
start=mid+1;
}
return e;
}
}